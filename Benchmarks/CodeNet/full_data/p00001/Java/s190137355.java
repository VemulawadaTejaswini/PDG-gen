public class Main{
  public static void main(String[]args)
  {
    int [] array = new int[10];
    
      array[0]=23;
      array[1]=32;
      array[2]=34;
      array[3]=12;
      array[4]=65;
      array[5]=98;
      array[6]=23;
      array[7]=12;
      array[8]=92;
      array[9]=134;
      
      
     
      int temp;
      for (int m=0; m<9;m++)
      {
      if (array[m]>array[m+1])
       
      {
        temp=array[m+1];
        array[m+1]=array[m];
        array[m]=temp;
      }
      }
      
      for (int b=9; b>6; b--)
      System.out.println(array[b]);
      
  }
}