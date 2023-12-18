//mikannsei
//collections.sort wo tukaitai kedo
//Comparator no tukaikata ga mada wakattenai node
//ittann pasu simasu

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Set[] set = new Set[n];
    for(int i = 0;i<n;i++){
    set[i].in(i+1,sc.next(),sc.nextInt());
    }


  }

  public static class Set {
    int number;
    String name;
    int point;
    public void in(int num,String s,int p){
      this.number = num;
      this.name = s;
      this.point = p;
    }
  }
}
