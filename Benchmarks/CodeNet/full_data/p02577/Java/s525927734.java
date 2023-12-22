import java.util.*;
class Main{

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int res =0;
    for(int i=0; i<s.length(); i++) {
    res += Integer.parseInt(s.charAt(i));
    res = res%9;
    }
    if(res==0)
    System.out.println("Yes");
    else
    System.out.println("No");
     //   System.out.println("Hello World");
    }
}
