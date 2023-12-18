import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    char[] c = sc.next().toCharArray();
    List<Integer> list = new ArrayList<>();
    int cnt = 1;
    if(c[0]=='0')list.add(0);
    for(int i=1;i<n;i++){
      if(c[i]==c[i-1])cnt++;
      else{
        list.add(cnt);
        cnt=1;
      }
    }
    list.add(cnt);
    int max = 0;
    for(int i=0;i<list.size();i+=2){
      int sum = 0;
      for(int j=0;j<=Math.min(k*2,list.size()-1-i);j++)sum+=list.get(i+j);
      max=Math.max(max,sum);
    }
    System.out.println(max);
  }
}