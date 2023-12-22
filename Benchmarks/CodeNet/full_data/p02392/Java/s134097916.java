import java.util.Scanner;
class Main{

	public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int a;
int b;
int c;
int hantei = 0;

a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();

if(a<b){
	hantei++;
}else{
	hantei = 0;
}

if(a<c){
	hantei++;
}else{
	hantei = 0;
}

if(b<c){
	hantei++;
}else{
	hantei = 0;
}
if(hantei==3){
	System.out.println("Yes");
}else{
	System.out.println("No");
}

    }
}