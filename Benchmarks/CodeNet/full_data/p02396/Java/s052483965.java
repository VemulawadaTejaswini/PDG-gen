public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int i = 0;
int a;
String b="";
do{
	a=scan.nextInt();
	if(a==0)break;
		b+="Case "+i+": "+a+"\n";
		i++;
}while(true);
System.out.println(b);
	}
}