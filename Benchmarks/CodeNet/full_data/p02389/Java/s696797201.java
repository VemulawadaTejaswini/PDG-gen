import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException  {
        int c;
        int i = 0;
        int deru = 0;
         int hairetsu[] = new int[4];
        while ((c = System.in.read()) != -1  )
        {
            // System.out.println(c);
            if ( c > 47 && c < 58)
            {
                 hairetsu[i] = c-48;
                 i++;
            //  System.out.println("Qurege_no_kazu_keta_hantaikara:" + Qurage_no_kazu);
            }
          
            if ( c == 10)
            {
                 deru++; //return ga 2kai kitara while wo deru
            }
             if (deru > 0)
            {
                break;
            }
        }
            // System.out.println("Ookii_Qurage_no_kazu:" + Ookii_Qurage_no_kazu);
            // System.out.println("Chiisai_Qurage_no_kazu:" + Chiisai_Qurage_no_kazu);
            
         System.out.println(hairetsu[0]*hairetsu[1] + " " + (2*(hairetsu[0]+hairetsu[1])));
            }

}