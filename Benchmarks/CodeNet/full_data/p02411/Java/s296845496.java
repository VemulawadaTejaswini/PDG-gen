import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str;
      String[] arr;
      int midterm;
      int finalexam;
      int retake;
      int sum;
      char grade;
      
      while(true){
         str = sc.nextLine();
         arr = str.split(" ");
         
         midterm = Integer.parseInt(arr[0]);
         finalexam = Integer.parseInt(arr[1]);
         retake = Integer.parseInt(arr[2]);
         
         sum = midterm + finalexam;
         
         if(midterm == -1 && finalexam == -1 && retake == -1){
            break;
         }
         
         if(midterm == -1 || finalexam == -1){
            grade = 'F';
         }else if(sum >= 80){
            grade = 'A';
         }else if(sum >= 65){
            grade = 'B';
         }else if(sum >= 50){
            grade = 'C';
         }else if(sum >= 30){
            if(retake >= 50){
               grade = 'C';
            }else{
               grade = 'D';
            }
         }else{
            grade = 'F';
         }
         System.out.println(grade);
      }  
      
   }//main
}//class