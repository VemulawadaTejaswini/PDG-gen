import java.util.Scanner;
   
class Main
{
   
    public static void main(String[] args)
    {   Scanner stdIn=new Scanner(System.in);
        int a=stdIn.nextInt();
        int b=stdIn.nextInt();
        int c=stdIn.nextInt();
          
       if(a<b && b<c){System.out.println(a+" "+b+" "+c);
	}
else if(a>b && b<c && a<c){System.out.println(b+" "+a+" "+c);
	}
else if(a>b && b>c && a>c){System.out.println(c+" "+b+" "+a);
	}
else if(a>b && b<c && a>c){System.out.println(b+" "+c+" "+a);
	}
else if(a<b && b>c && a>c){System.out.println(c+" "+a+" "+b);
	}
else if(a<b && b>c && a<c){System.out.println(a+" "+c+" "+b);
	}
          
    }
}