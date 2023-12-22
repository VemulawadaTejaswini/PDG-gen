import java.util.*;

class Main{
	Scanner scan=new Scanner(System.in);
	int m;
	int f;
	int r;
	String han;
	public Main(){
		for(;;){
			m=scan.nextInt();
			f=scan.nextInt();
			r=scan.nextInt();
			if(m==-1&&f==-1&&r==-1){
				break;
			}else if(m==-1||f==-1){
				han="F";
	//			System.out.println("F");
			}else if(m+f>=80){
				han="A";
	//			System.out.println("A");
			}else if(65<=m+f&&m+f<80){
				han="B";
	//			System.out.println("B");
			}else if(50<=m+f&&m+f<65){
				han="C";
	//			System.out.println("C");
			}else if(30<=m+f&&m+f<50){
				han="D";
	//			System.out.println("D");
			}else if(m+f<30){
				han="F";
	//			System.out.println("F");
			}
	        if(r>=50){
				han="C";
			}
			System.out.println(han);
	    }
	}
	public static void main(String[] args){
		new Main();
	}
}