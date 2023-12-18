import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
  public static void main(String[] args)
  {

    Scanner reader =new Scanner (System.in);
    int a =reader.nextInt();
    int array[];
    int counter[];
    int min=0;
    array=new int [a];
    counter=new int [a];
    for(int i=0;i<a;i++)
    {
      array[i]=reader.nextInt();
      while(array[i]%2!=1)
      {
        array[i]=array[i]/2;
        counter[i]++;

      }


    }
min =counter[0];
 for(int i=0;i<a;i++)
 {

   if(counter[i]<min)
   {
     min=counter[i];

   }

 }
 System.out.println (min);

}
}
