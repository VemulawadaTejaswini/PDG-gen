import java.util.Scanner;

public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
String op =sc.nextLine();

if(op.equals("+")){
System.out.println(a+b);
}else if(op.equals("-")){
	System.out.println(a-b);
}else if(op.equals("*")){
	System.out.println(a*b);
}else if(op.equals("/")){
	System.out.println(a/b);
}else{
break;
}

}
}
