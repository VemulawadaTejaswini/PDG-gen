import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
Scanner sc=new Scanner(System.in);
String a=sc.next();
String[] b=new String[a.length()];
for(int i=0;i<b.length;i++){
    String c=String.valueOf(a.charAt(i));
    b[i]=c;
}
if(b[0].equals(b[b.length-1])&&b[0].equals(b[((b.length-1)/2)-1])&&b[((b.length+3)/2)-1].equals(b[b.length-1])){
        System.out.println("Yes");
}else{
System.out.println("No");
}
}
}