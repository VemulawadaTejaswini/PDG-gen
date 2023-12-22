import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
sc.useDelimiter("\\s"); // 半角スペースを区切り文字に設定
int a;
a= sc.nextInt();
int b;
b= sc.nextInt();
if (a < b)
System.out.println("a < b");
else if(a > b)
System.out.println("a>b");
else
System.out.println("a = b");
}
}

