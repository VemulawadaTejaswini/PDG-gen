import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String  S=sc.next();
    String[] Ss=S.split("");

if(Ss[Ss.length-1].equals("s")){
  System.out.println(S+"es");

}else{
  System.out.println(S+"s");
}

}
}
