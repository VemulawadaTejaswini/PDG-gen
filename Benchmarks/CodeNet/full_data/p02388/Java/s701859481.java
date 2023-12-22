import java.io.*;

public class XCubic
{
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try 
        {
            String line = reader.readLine();
            int num = Integer.parseInt(line);
            int Y;
            Y = 3;
            
            System.out.println(Math.pow(num,Y));       

        }
        catch (IOException e) 
        {
            System.out.println(e);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("The input number was not correct.");
        }
        
    }
}
