import java.util.*;
import java.io.*;

class Main{
  static int n;
  static int num[],nums[];
  static char mark[],marks[];
  static String s = "Stable";
  public static void main(String[] args){
      int i,j=1,k=0;
      try{
          InputStreamReader ir = new InputStreamReader(System.in);
           BufferedReader buffer = new BufferedReader (ir);
           String str1 = buffer.readLine();
           n = Integer.parseInt(str1);
           String str2 = buffer.readLine();
      num = new int[n];
      nums = new int[n];
      mark = new char[n];
      marks = new char[n];
      for(i=0;i<n;i++){
        mark[i] = str2.charAt(k);
        num[i] = Character.getNumericValue(str2.charAt(j));
        k+=3;
        j+=3;
      }
    }catch(IOException e){
        System.out.println("error1");
    }

    System.arraycopy(num,0,nums,0,n);
    System.arraycopy(mark,0,marks,0,n);

    BubbleSort();
    for(i=0;i<n;i++){
      if(i==n-1){
        System.out.println(mark[i]+""+num[i]);
        System.out.println(s);
        break;
      }
      System.out.print(mark[i]+""+num[i]+" ");
    }
   SelectionSort();
    if(Arrays.equals(mark,marks)!=true){
      s = "Not stable";
    }
    for(i=0;i<n;i++){
      if(i==n-1){
        System.out.println(marks[i]+""+nums[i]);
        System.out.println(s);
        break;
      }
      System.out.print(marks[i]+""+nums[i]+" ");
    }
  }

static void BubbleSort(){
  int i,j,temp;
  char temps;
  for(i=0;i<n;i++){
    for(j=n-1;j>i;j--){
      if(num[j]<num[j-1]){
        temp = num[j];
        num[j] = num[j-1];
        num[j-1] = temp;
        temps = mark[j];
        mark[j] = mark[j-1];
        mark[j-1] = temps;
      }
    }
  }
}

static void SelectionSort(){
  int i,j,temp,minj;
  char temps;
  for(i=0;i<n;i++){
    minj = i;
    for(j=i;j<n;j++){
      if(nums[j]<nums[minj]){
        minj = j;
      }
    }
    if(i!=minj){
        temp = nums[i];
        nums[i] = nums[minj];
        nums[minj] = temp;
        temps = marks[i];
        marks[i] = marks[minj];
        marks[minj] = temps;
      }
    }
  }


}

