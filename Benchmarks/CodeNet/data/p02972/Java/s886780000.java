import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int[] a = new int [n+1];
    for(int i = 0; i < n; i++){
        a[i+1] = sc.nextInt();
    }
    //int[] a = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    sc.close();
    int cnt = 0;
    List<Integer>ans = new ArrayList<Integer>();
    for(int i = n; i >= 1; i--){
        int tmp = a[i];
        int alr = 0;
        for(int j = 2; j <= n; j++){
            if((i*j) > n){
                break;
            }else{
                alr += a[(i*j)];
            }
        }
        if((tmp%2) != (alr%2)){
            ans.add(i);
            cnt += 1;
        }
    }
    System.out.println(cnt);
    Collections.reverse(ans);
    int i = 0;
    for(int v: ans){
        if(i == n){
            System.out.print(v);
        }else{
            System.out.print(v+" ");
        }
    }
    //ans.stream().forEach(b -> {System.out.print(b + " ");});
  }
}