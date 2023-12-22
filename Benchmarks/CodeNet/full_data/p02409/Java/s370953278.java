import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int [] rooms = new int[500];
            for(int i=0;i<n;i++){
                int b = sc.nextInt();
                int f = sc.nextInt();
                int r = sc.nextInt();
                int v = sc.nextInt();
                rooms[getIndex(b,f,r)] += v;
            }
            String lineDelimiter = "";
            for(int b = 1; b<=4; b++){
                System.out.print(lineDelimiter);
                for(int f=1; f<=3; f++){
                    for(int r=1;r<=10;r++){
                        System.out.print(' ');
                        System.out.print(rooms[getIndex(b,f,r)]);
                    }
                    System.out.println();
                }
                lineDelimiter = "####################" + System.lineSeparator();
            }
        }
    }

    private static int getIndex(int b, int f, int r) {
        return(b-1)*100+(f-1)*10+(r-1);
    }
}
