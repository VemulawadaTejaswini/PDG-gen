import java.io.*;
    
class Main
{
     static InputStreamReader isr;
     static BufferedReader br;
     static String output;
     static String[] data = new String[3];
    
     static void initialize ()
     {
          isr = new InputStreamReader(System.in);
          br = new BufferedReader(isr);
          output = null;
          for (String d : data)
          {
               d = null;
          }
     }

     static void output (String[] data)
     {
           int i = 0;
           output = "No";
           if (Integer.parseInt(data[i])-Integer.parseInt(data[++i]) < 0) if (Integer.parseInt(data[i])-Integer.parseInt(data[++i]) < 0) output = "Yes";
           System.out.println(output);
     }
    
     public static void main (String[] args)
     {
           initialize();
           try {
                data = (br.readLine()).split(" ");
                output(data);
           } catch (IOException e) {
           } finally {
                try {
                      br.close();
                } catch (IOException e) {
                }
           }
     }
}