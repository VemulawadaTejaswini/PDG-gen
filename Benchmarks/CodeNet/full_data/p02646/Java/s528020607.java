import java.util.Scanner;

class Main{
      public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int v = sc.nextInt();
	int b = sc.nextInt();
	int w = sc.nextInt();
	int t = sc.nextInt();
	boolean esc = false;
	boolean sign = true;
	if(a<b){
	    sign = false;
	}
	for(int i=0;i<t;i++){
	    if(sign){
		a+=v;
		b+=w;
	    }else{
		a-=v;
		b-=w;
	    }
	    if(sign&&a>=b){
		esc = true;
		break;
	    }else if(!sign&&a<=b){
		esc = true;
		break;
	    }
	}
	if(esc){
	    System.out.println("YES");
	}else{
	    System.out.println("NO");
	}
      }
}
