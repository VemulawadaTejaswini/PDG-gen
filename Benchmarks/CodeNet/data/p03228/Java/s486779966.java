import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int taka = sc.nextInt();
    int ao = sc.nextInt();
    int cnt = sc.nextInt();
    for(int i = 1; i <= cnt; i++){
        if(i % 2 == 1){
            if(taka % 2 == 1){
                taka--;
            }
            taka = taka / 2;
            ao += taka;
        }else{
            if(ao % 2 == 1){
                ao--;
            }
            ao = ao / 2;
            taka += ao;
        }
    }
    System.out.println(taka + " " + ao);
  }
}