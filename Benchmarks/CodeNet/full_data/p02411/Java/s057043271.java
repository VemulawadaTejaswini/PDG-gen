import java.util.*; 
class main
{
  public static void main(String[] args)
  {
    String[][] each_grade = new String[4][3];
    
    for(int i=0; i<4; i++)
    {
      Scanner a = new Scanner(System.in);
      String numeric = a.nextLine();
      each_grade[i] = numeric.split(" ");
    }
    
    for(int i=0; i < each_grade.length; i++)
    {
      int midterm = Integer.parseInt(each_grade[i][0]);
      int finals = Integer.parseInt(each_grade[i][1]);
      int makeup = Integer.parseInt(each_grade[i][2]);
      
       if(midterm == -1 || finals == -1)
       {  
           System.out.println("F");
       }
       else if(midterm + finals >= 80)
       {
         System.out.println("A");
       }
       else if(midterm + finals >= 65 && midterm + finals < 80)
       {
         System.out.println("B");
       }
       else if(midterm + finals >= 50 && midterm + finals < 65)
       {
         System.out.println("C");
       }
       else if(midterm + finals >= 30 && midterm + finals < 50)
       {
         if(makeup >= 50)
         {
           System.out.println("C");
         }
         else
         {
           System.out.println("D");
         }
       }
       else if(midterm + finals < 30)
       {
         System.out.println("F");
       }
    }
  }
}
