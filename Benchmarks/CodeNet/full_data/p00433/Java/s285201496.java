import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[4];
	int b[]=new int[4];
	int s=0,t=0;
	for(int i=0;i<4;i++){
		a[i]=sc.nextInt();
		s+=a[i];
	}
	for(int i=0;i<4;i++){
		b[i]=sc.nextInt();
		t+=b[i];
	}
	if(s>=t)System.out.println(s);
	else System.out.println(t);
	}
}