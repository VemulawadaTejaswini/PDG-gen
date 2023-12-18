import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final String S = sc.nextLine();
        String T = "";
        String[] str = {"dream","dreamer","erase","eraser"};

            for ( int i = 0; i <= 3; i++ ){
                T = T + str[i];
                if( S.equals(T)){
                    System.out.println("YES");
                    System.exit(0); 
                }
                for (int j = 0; j <= 3; j++ ){
                    T = str[i] + str[j];
                    if( S.equals(T)){
                        System.out.println("YES");
                        System.exit(0);       
                    }
                    for (int k = 0; k <= 3; k++ ){
                        T = str[i] + str[j] + str[k];
                        if( S.equals(T)){
                            System.out.println("YES");
                            System.exit(0);        
                        }
                        for(int l = 0; l <= 3; l++){
                            T = str[i] + str[j] + str[k] + str[l];
                            if( S.equals(T)){
                                System.out.println("YES");
                                System.exit(0);         
                            }
                        }
                    }
                }
            }
            System.out.println("NO");
    }
}
