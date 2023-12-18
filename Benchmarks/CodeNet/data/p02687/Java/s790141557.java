import java.util.Scanner;
class comp {

    public static void main (String args[])
    {
        Scanner myObj = new Scanner(System.in);
        String compet = myObj.nextLine();

        if(compet=="ABC") System.out.println("ARC");
        else if(compet=="ARC") System.out.println("ABC");
    }
    
    }
    
    
}