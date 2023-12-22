import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	int[] hn;
	char[] hc;
	int d, r=0, b=0, g=0, rf=0, bf=0, gf=0, n, rcount=0, bcount=0, gcount=0, count=0;
	char c;
	hn = new int[9];
	hc = new char[9];
	for(int i=0;i<T;i++){
	    for(int j=0;j<9;j++) hn[j] = sc.nextInt();
	    for(int j=0;j<9;j++){
		String s = sc.next();
		hc[j] = s.charAt(0);
	    }
	    for(int j=0;j<9;j++){
		for(int k=0;k<8-j;k++){
		    if(hn[k]>hn[k+1]){
			d=hn[k]; hn[k]=hn[k+1]; hn[k+1]=d;
			c=hc[k]; hc[k]=hc[k+1]; hc[k+1]=c;
		    }
		}
	    }
	    for(int j=0;j<9;j++){
		if(hc[j]=='R'){
		    n = hn[j]-r;
		    if(n==0){
			if(rf!=1) rcount=1;
			rcount++;
			rf=1;
		    }else if(n==1){
			if(rf!=2) rcount=1;
			rcount++;
			rf=2;
		    }else{
			rcount=0;
			rf=0;
		    }
		    if(rcount==3){
			count++;
			rcount=0;
		    }
		    r=hn[j];
		}else if(hc[j]=='B'){
		    n = hn[j]-b;
		    if(n==0){
			if(bf!=1) bcount=1;
			bcount++;
			bf=1;
		    }else if(n==1){
			if(bf!=2) bcount=1;
			bcount++;
			bf=2;
		    }else{
			bcount=0;
			bf=0;
		    }
		    if(bcount==3){
			count++;
			bcount=0;
		    }
		    b=hn[j];
		}else if(hc[j]=='G'){
		    n = hn[j]-g;
		    if(n==0){
			if(gf!=1) gcount=1;
			gcount++;
			gf=1;
		    }else if(n==1){
			if(gf!=2) gcount=1;
			gcount++;
			gf=2;
		    }else{
			gcount=0;
			gf=0;
		    }
		    if(gcount==3){
			count++;
			gcount=0;
		    }
		    g=hn[j];
		}
	    }
	    if(count==3) System.out.println("1");
	    else System.out.println("0");
	}
    }
}