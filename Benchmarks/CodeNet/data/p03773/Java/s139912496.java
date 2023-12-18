import java.util.*;
class Main{
 public static void main(String[] args){
  new Main().solve();
}
public void solve(){
Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = sc.nextInt();
if(A+B > 24) System.out.println(A+B-24);
else System.out.println(A+B);
}

}