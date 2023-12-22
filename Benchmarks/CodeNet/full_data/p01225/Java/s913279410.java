import java.util.*;
import java.io.*;

class Set{
    int num=0;
    int color=0; 

    boolean checkNum(Set num1, Set num2, Set num3){
        int i,j;
        i = num3.num - num2.num;
        j = num2.num - num1.num;
        if(((i == 1) && (j == 1)) || ((i == 0) && (j == 0))){
            return true;
        }else{
            return false;
        }
    }

    boolean sameColor(Set cl1, Set cl2, Set cl3){
        if((cl1.color == cl2.color) && (cl2.color == cl3.color)){
            return true;
        }else{
            return false;
        }
    }
} //end_of_Set

class DataComparator implements java.util.Comparator<Set>{
    public int compare(Set o1, Set o2){
        if(o1.color == o2.color){
            return o1.num - o2.num;
        }else{
            return o1.color - o2.color;
        }
    }
}

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //number_of_data-set
    Set[] card = new Set[9];

    for(int i=0;i<n;i++){
      for(int j=0;j<9;j++){ //input_numbers
        card[j] = new Set();
        card[j].num = sc.nextInt();
      }
      sc.nextLine();
      String line = sc.nextLine();
      String[] ch= line.split(" ");
      for(int l=0;l<9;l++){  //check_color
        switch(ch[l]){
          case "R": card[l].color = 1;
                    break;
          case "G": card[l].color = 2;
                    break;
          case "B": card[l].color = 3;
                    break;
          default : break;
        }
      }
      Arrays.sort(card, new DataComparator());

/*    sort degug
      for(int k=0;k<9;k++){
          System.out.print(card[k].num + " ");
      }
      System.out.println();
      for(int k=0;k<9;k++){
          System.out.print(card[k].color + " ");
      }
      System.out.println();
*/

      Set check1 = new Set();
      Set check2 = new Set();
      Set check3 = new Set();

      if(check1.sameColor(card[0],card[1],card[2])){
          if(check1.checkNum(card[0],card[1],card[2])){
          }else{
             System.out.println(0);
             continue;
          }
      }
      else{
        System.out.println(0);
        continue;
      }
      
      if(check2.sameColor(card[3],card[4],card[5])){
          if(check2.checkNum(card[3],card[4],card[5])){
          }else{
             System.out.println(0);
             continue;
          }
      }
      else{
        System.out.println(0);
        continue;
      }

      if(check3.sameColor(card[6],card[7],card[8])){
          if(check3.checkNum(card[6],card[7],card[8])){
          }else{
             System.out.println(0);
             continue;
          }
      }
      else{
        System.out.println(0);
        continue;
      }

    System.out.println(1);
    }//end_of_while
  }//end_of_main
}//end_of_Rummy