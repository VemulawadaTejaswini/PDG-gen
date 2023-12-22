import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
while (true){
String str = sc.next();
if (str.equals("-"))break;
int leng = str.length();
int shuffle = sc.nextInt();
for(int i=0;i<shuffle;i++){
int n = sc.nextInt();
str = str.substring(n, leng) + str.substring(0, n);
}
System.out.println(str);
}
sc.close();
}
}
