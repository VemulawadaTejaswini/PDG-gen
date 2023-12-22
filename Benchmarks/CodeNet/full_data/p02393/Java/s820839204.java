import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int d=0;//1?????§??????
int e=0;//2
int f=0;//3
if(a<b){
	if(b<c){
		d=c;
		e=b;
		f=a;
	}
	else {
		d=b;
		e=c;
		f=a;
	}
}
else if(a>b){
	if(a<c){
		d=c;
		e=a;
		f=b;
	}
	else {
		d=a;
		e=c;
		f=b;
	}
	
}else if(a<c){
	if(c<b){
		d=b;
		e=c;
		f=a;
	}
	else {
		d=c;
		e=b;
		f=a;
	}

}
else if(a>c){
	if(a<b){
		d=b;
		e=a;
		f=c;
	}
	else {
		d=a;
		e=b;
		f=c;
	}
	}
else if(b>c){
	if(b<a){
		d=a;
		e=b;
		f=c;
	}
	else {
		d=b;
		e=a;
		f=c;
	}
	}
else if(b<c){
	if(c<a){
		d=a;
		e=c;
		f=b;
	}
	else {
		d=c;
		e=a;
		f=b;
	}
	}
System.out.println(f+" "+e+" "+d);
	}
}