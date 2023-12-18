import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main{ 
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Set<String> ss=new HashSet<String>();

 for(int i=0;i<n;i++){
    ss.add(sc.next());
}
System.out.println(ss.size());

}

}