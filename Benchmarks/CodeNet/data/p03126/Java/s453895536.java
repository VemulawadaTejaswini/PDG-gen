import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int fs = sc.nextInt();
    Set set = new Set();
    for(int i=0;i<fs;i++){
    	set.add(sc.nextInt);
    }
    for(int i=0;i<N-1;i++){
      fs = sc.nextInt();
      for(int j=0;j<fs;j++){
        if(sc.