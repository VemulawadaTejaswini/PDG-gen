import java.util.Scanner;;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a[];
	a=new int [5];
	int s=0;
	for(int i=0;i<5;i++){
		 a[i]= sc.nextInt();
	}
	for(int i=0;i<5;i++){
		if(a[i]<40){
			s+=40;
		}
		else{s+=a[i];}
	}
	System.out.println(s/5);
}
	}