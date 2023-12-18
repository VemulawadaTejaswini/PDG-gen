import java.util.Scanner;

class syllabus
{
    public static void main(String[] arg)
    {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        //char[] a= S.toCharArray();
        String One = "Sunny";
        String Two = "Cloudy";
        String Three = "Rainy";
        if(One.contentEquals(S)){
            System.out.println(Two);
        }
        else if(Two.contentEquals(S)){
            System.out.println(Three);
        }
        else if(Three.contentEquals(S)){
        	System.out.println(One);
    	}


    }
}
