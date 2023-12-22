import java.io.*;

public class Main{
 public static void main(String[] args){
  BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
  try{
   String phrase =reader.readLine();
   int[] alphabet =new int[26];
   //Search the length of the phrase
   for(int i=0;i<phrase.length();i++){
    char case =phrase.charAt(i);   //sesrch each case
    int case_s=(int)case-(int)'a'; //For counting lowercase
    int case_C=(int)case-(int)'A'; //For counting capitalcase
    //If a case in the phrase is "j"st alphabet,add 1 to the counter of it
    for(int j=0;j<26;j++){
     if(case_s==j||case_C==j){
      alphabet[j]++;
     }
   }
   }
    //Output the result (use ASCII code)
    for(int k=0;k<26;k++){
     System.out.println((char)(97+k)+" : "+alphabet[k]);
    }
  }catch(IOException e){
   System.out.println(e);
  }

 }
}