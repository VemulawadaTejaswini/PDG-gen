import java.util.Scanner;
import java.util.stream.*;
class Main {
public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int count = 0;
    if(n.length() % 2 == 1){
    System.out.println("no");
    System.exit(0);
    }else{
    for(int i = 0;i<n.length();i++){
    Stream<String> s = Stream.of(n.split(""));
    String  c = String.valueOf(n.charAt(i));
    count += s.filter(x -> c.equals(x)).count();
    }
    if(count %2 == 0){
    System.out.println("Yes");
    }
    }
    }
}