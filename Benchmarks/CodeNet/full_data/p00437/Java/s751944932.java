import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] parts;
		byte a,b,c;
		while(((a=s.nextByte())|(b=s.nextByte())|(c=s.nextByte()))!=0) {
			parts = new int[a+b+c];
			Arrays.fill(parts,2);
			Exam[] exams = new Exam[s.nextInt()];
			for(int i=0;i<exams.length;++i)
				exams[i]=new Exam(
						Integer.parseInt(s.next()),
						Integer.parseInt(s.next()),
						Integer.parseInt(s.next()),
						Integer.parseInt(s.next())
						);
			Arrays.sort(exams, (o1, o2) -> o2.r-o1.r);
			for(int i=0;i<exams.length;i++) {
				Exam e = exams[i];
				switch (e.r) {
				case 1:
					parts[e.a]=1;
					parts[e.b]=1;
					parts[e.c]=1;
					break;
				case 0:
					boolean
						ba=(parts[e.a]==1),
						bb=(parts[e.b]==1),
						bc=(parts[e.c]==1);
					if(!ba&& bb&& bc)
						parts[e.a]=0;
					if( ba&&!bb&& bc)
						parts[e.b]=0;
					if( ba&& bb&&!bc)
						parts[e.c]=0;
					break;
				}
			}
			System.out.println(Arrays.toString(parts).replaceAll("[^0-9,]", "").replaceAll(",", "\n"));
		}
	}
}
class Exam{
	int a,b,c,r;
	Exam(int p1,int p2,int p3,int re) {
		a=p1-1;
		b=p2-1;
		c=p3-1;
		r=re;
	}
}