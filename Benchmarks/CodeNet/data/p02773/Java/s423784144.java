import java.util.*;
public class Main {
    public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
      	String p[] = new String[n];
      	int pcnt[] = new int[n];
      	int cnt = 0;
      	for(int i=0;i<p.length;i++){
          p[i] = sc.next();
          for(int t=0;t<i;t++){
            if( p[i]==p[t] ){
              pcnt[t]++;
            }
              if( pcnt[t]>cnt ){
                cnt = pcnt[t];
              }
              t=i;
            }
          }
        
      int num = 0;
      for(int i=0;i<pcnt.length;i++){
        if(pcnt[i]==cnt){
          num++;
        }
      }
      int number[] = new int[num];
      int count = 0;
      for(int i=0;i<pcnt.length;i++){
        if(pcnt[i]==cnt){
          number[count] = i;
          count++;
        }
      }
      for(int i=0;i<number.length;i++){
        for(int j=i+1;j<number.length;j++){
          if(p[number[i]].compareTo(p[number[j]]) > 0 ){
            String tmp = p[number[i]];
            p[number[i]] = p[number[j]];
            p[number[j]] = tmp;
          }
        }
      }
      for(int i=0;i<number.length;i++){
        System.out.println(p[number[i]]);
      }
      
      
    }
}