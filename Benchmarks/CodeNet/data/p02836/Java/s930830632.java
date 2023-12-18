import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();

        int stLength = st.length();
        int counter=0;

        //System.out.println(stLength);
        //System.out.println(st.substring(0,1));
        for(int i = 0;i<stLength/2;i++)
        {
            //System.out.print(st.substring(i,i+1)+",");
            //System.out.println(st.substring(stLength-i-1,stLength-i));
            if(!(st.substring(i,i+1).equals(st.substring(stLength-i-1,stLength-i))))
            {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
