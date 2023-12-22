import java.io.*;
import java.util.StringTokenizer;

class Point {
	double x,y;
	Point(double x,double y) {
		this.x = x;
		this.y = y;
	}
	boolean NotEqual(Point p) {
		if (this.x==p.x&&this.y==p.y) return false;
		else return true;
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				int n = Integer.parseInt(buf);
				Point p[] = new Point[n];
				for (int i=0;i<n;i++) {
					buf = br.readLine();
					StringTokenizer st = new StringTokenizer(buf,",");
					p[i] = new Point(Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken()));
				}
				quicksort(0,n-1,p);
				sorty(n,p);
				Point ans[] = construct(n,p);
				System.out.println(n-ans.length);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Point[] construct(int n,Point p[]) {
		return construct_left(n,p);
	}

	public static Point[] construct_left(int n,Point p[]) {
		if (n==2) {
			Point c[] = new Point[n];
			c[0] = p[1];
			c[1] = p[0];
			return c;
		} else if (n==3) {
			Point c[] = new Point[n];
			if (S(p[2],p[1],p[0])<0) {
				c[0] = p[2];
				c[1] = p[0];
				c[2] = p[1];
			} else {
				c[0] = p[2];
				c[1] = p[1];
				c[2] = p[0];
			}
			return c;
		}

		Point pl[] = new Point[n/2];
		Point pr[] = new Point[n/2+1];
		for (int i=0;i<n/2;i++) {
			pl[i] = p[i];
			pr[i] = p[n/2+i];
		}
		int mid = n/2;
		if (n%2==1) {
			pr[n/2] = p[n-1];
			mid = n/2+1;
		}

		Point c1[] = construct_left(n/2,pl);
		Point c2[] = construct_right(mid,pr);

		Point cnt1[] = new Point[2]; //cnt1 : 上部接線
		cnt1[0] = c1[0];
		cnt1[1] = c2[0];
		int lc,rc;
		lc = rc = 1;
		for (int i=0;i<2;i++) {
			while (S(cnt1[0],cnt1[1],c2[rc])>0) {
				cnt1[1] = c2[rc];
				rc = (rc+1)%c2.length;
			}
			while (S(cnt1[1],cnt1[0],c1[lc])<0) {
				cnt1[0] = c1[lc];
				lc = (lc+1)%c1.length;
			}
		}

		Point cnt2[] = new Point[2]; //cnt2 : 下部接線
		cnt2[0] = c1[0];
		cnt2[1] = c2[0];
		lc = c1.length-1;
		rc = c2.length-1;
		for (int i=0;i<2;i++) {
			while (S(cnt2[1],cnt2[0],c1[lc])>0) {
				cnt2[0] = c1[lc];
				lc = (lc+(c1.length-1))%c1.length;
			}
			while (S(cnt2[0],cnt2[1],c2[rc])<0) {
				cnt2[1] = c2[rc];
				rc = (rc+(c2.length-1))%c2.length;
			}
		}

		Point nl[] = new Point[n];
		lc = 0;
		int pt = 0;
		int mem = 0;
		double xmax = c2[0].x;
		for (int i=1;i<c2.length;i++) {
			if (xmax<c2[i].x) {
				xmax = c2[i].x;
				pt = i;
				mem = i;
			}
		}
		while (pt<c2.length&&c2[pt].NotEqual(cnt1[1])) {
			nl[lc] = c2[pt];
			lc++;
			pt = (pt+(c2.length-1))%c2.length;			
		}
		nl[lc++] = cnt1[1];
		pt = 0;
		while (pt<c1.length&&c1[pt].NotEqual(cnt1[0])) {
			pt = (pt+1)%c1.length;
		}
		nl[lc++] = cnt1[0];
		pt = (pt+1)%c1.length;
		while (pt<c1.length&&c1[pt].NotEqual(cnt2[0])) {
			nl[lc] = c1[pt];
			lc++;
			pt = (pt+1)%c1.length;
		}
		nl[lc++] = cnt2[0];
		pt = 0;
		while (pt<c2.length&&c2[pt].NotEqual(cnt2[1])) {
			pt = (pt+(c2.length-1))%c2.length;
		}
		if (cnt2[1].NotEqual(c2[mem])) {
			nl[lc++] = cnt2[1];
			pt = (pt+(c2.length-1))%c2.length;
		}
		while (pt<c2.length&&c2[pt].NotEqual(c2[mem])) {
			nl[lc] = c2[pt];
			lc++;
			pt = (pt+(c2.length-1))%c2.length;
		}

		Point c[] = new Point[lc];
		for (int i=0;i<lc;i++) c[i] = nl[i];

		return c;
	}

	public static Point[] construct_right(int n,Point p[]) {
		if (n==2) {
			Point c[] = new Point[n];
			c[0] = p[0];
			c[1] = p[1];
			return c;
		} else if (n==3) {
			Point c[] = new Point[n];
			if (S(p[0],p[1],p[2])>0) {
				c[0] = p[0];
				c[1] = p[2];
				c[2] = p[1];
			} else {
				c[0] = p[0];
				c[1] = p[1];
				c[2] = p[2];
			}
			return c;
		}

		Point pl[] = new Point[n/2];
		Point pr[] = new Point[n/2+1];

		for (int i=0;i<n/2;i++) {
			pl[i] = p[i];
			pr[i] = p[n/2+i];
		}
		int mid = n/2;
		if (n%2==1) {
			pr[n/2] = p[n-1];
			mid = n/2+1;
		}

		Point c1[] = construct_left(n/2,pl);
		Point c2[] = construct_right(mid,pr);

		Point cnt1[] = new Point[2]; //cnt1 : 上部接線
		cnt1[0] = c1[0];
		cnt1[1] = c2[0];
		int lc,rc;
		lc = rc = 1;
		for (int i=0;i<2;i++) {
			while (S(cnt1[0],cnt1[1],c2[rc])>0) {
				cnt1[1] = c2[rc];
				rc = (rc+1)%c2.length;
			}
			while (S(cnt1[1],cnt1[0],c1[lc])<0) {
				cnt1[0] = c1[lc];
				lc = (lc+1)%c1.length;
			}
		}

		Point cnt2[] = new Point[2]; //cnt2 : 下部接線
		cnt2[0] = c1[0];
		cnt2[1] = c2[0];
		lc = c1.length-1;
		rc = c2.length-1;
		for (int i=0;i<2;i++) {
			while (S(cnt2[1],cnt2[0],c1[lc])>0) {
				cnt2[0] = c1[lc];
				lc = (lc+(c1.length-1))%c1.length;
			}
			while (S(cnt2[0],cnt2[1],c2[rc])<0) {
				cnt2[1] = c2[rc];
				rc = (rc+(c2.length-1))%c2.length;
			}
		}

		Point nr[] = new Point[n];
		rc = 0;
		int pt = 0;
		int mem = 0;
		double xmin = c1[0].x;
		for (int i=1;i<c1.length;i++) {
			if (xmin>c1[i].x) {
				xmin = c1[i].x;
				pt = i;
				mem = i;
			}
		}
		while (pt<c1.length&&c1[pt].NotEqual(cnt1[0])) {
			nr[rc] = c1[pt];
			rc++;
			pt = (pt+(c1.length-1))%c1.length;
		}
		nr[rc++] = cnt1[0];
		pt = 0;
		while (pt<c2.length&&c2[pt].NotEqual(cnt1[1])) {
			pt = (pt+1)%c2.length;
		}
		nr[rc++] = cnt1[1];
		pt = (pt+1)%c2.length;
		while (pt<c2.length&&c2[pt].NotEqual(cnt2[1])) {
			nr[rc] = c2[pt];
			rc++;
			pt = (pt+1)%c2.length;
		}
		nr[rc++] = cnt2[1];
		pt = 0;
		while (pt<c1.length&&c1[pt].NotEqual(cnt2[0])) {
			pt = (pt+(c2.length-1))%c2.length;
		}
		if (cnt2[0].NotEqual(c1[mem])) {
			nr[rc++] = cnt2[0];
			pt = (pt+(c1.length-1))%c1.length;
		}
		while (pt<c1.length&&c1[pt].NotEqual(c1[mem])) {
			nr[rc] = c1[pt];
			rc++;
			pt = (pt+(c1.length-1))%c1.length;
		}	

		Point c[] = new Point[rc];
		for (int i=0;i<rc;i++) c[i] = nr[i];

		return c;
	}

	public static void quicksort(int low,int high,Point p[]) {
		if (high>low) {
			int mid = (low+high)/2;
			double x = p[mid].x;
			int i = low;
			int j = high;
			while (p[i].x<x) i++;
			while (p[j].x>x) j--;
			if (i<=j) {
				Point t =p[i];
				p[i] = p[j];
				p[j] = t;
				i++;j--;
			}
			quicksort(low,j,p);
			quicksort(i,high,p);
		}
	}

	public static void sorty(int n,Point p[]) {
		for (int i=1;i<n;i++) {
			int j = i-1;
			while (p[j].x==p[j+1].x&&p[j].y>p[j+1].y) {
				Point t = p[j+1];
				p[j+1] = p[j];
				p[j] = t;
				j--;
				if (j<0) break;
			}
		}
	}

	public static double S(Point p0,Point p1,Point p2) {
		return (p1.x-p0.x)*(p2.y-p0.y)-(p2.x-p0.x)*(p1.y-p0.y);
	}
}