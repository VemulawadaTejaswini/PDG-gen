import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	
int se =sc.nextInt();

int sec, min, hour;
hour = se/3600;
min =(se%3600)/60;
sec = se % 60;

System.out.println(hour+":"+min+":"+sec);

    }
}
