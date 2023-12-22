
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static int w, h;
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
       o: while(true){
            w = scan.nextInt();
            h = scan.nextInt();
            if(w == 0 && h == 0)break;

            byte area[][] = new byte[w][h];
            for(int i = 0;i < h;i++){
                for(int j = 0;j < w;j++)area[j][i] = scan.nextByte();
            }
            HashSet<byte[][]> set = new HashSet<>();
            set.add(area);
            for(int i = 1;i <= 10;i++){
                HashSet<byte[][]> newset = new HashSet<>();
                for(byte[][] b : set){
                    p:for(int j = 0;j < h;j++){
                        for(int k = 0;k < w;k++){
                            if(b[k][j] == 2){
                                if(k != 0 && b[k-1][j] != 1)
                                for(int l = k-1;l >= 0;l--){
                                    if(b[l][j] == 1){
                                        byte[][] b2 = new byte[w][h];
                                        arrcpy(b, b2);
                                        b2[l][j] = 0;
                                        b2[l+1][j] = 2;
                                        b2[k][j] = 0;
                                        newset.add(b2);
                                        break;
                                    } 
                                    if(b[l][j] == 3){
                                        System.out.println(i);
                                        continue o;
                                    }
                                }
                                if(k != w-1 && b[k+1][j] != 1)
                                for(int l = k+1;l < w;l++){
                                    if(b[l][j] == 1){
                                        byte[][] b2 = new byte[w][h];
                                        arrcpy(b, b2);
                                        b2[l][j] = 0;
                                        b2[l-1][j] = 2;
                                        b2[k][j] = 0;
                                        newset.add(b2);
                                        break;
                                    } 
                                    if(b[l][j] == 3){
                                        System.out.println(i);
                                        continue o;
                                    }
                                }
                                if(j != 0 && b[k][j-1] != 1)
                                for(int l = j-1;l >= 0;l--){
                                    if(b[k][l] == 1){
                                        byte[][] b2 = new byte[w][h];
                                        arrcpy(b, b2);
                                        b2[k][l] = 0;
                                        b2[k][l+1] = 2;
                                        b2[k][j] = 0;
                                        newset.add(b2);
                                        break;
                                    } 
                                    if(b[k][l] == 3){
                                        System.out.println(i);
                                        continue o;
                                    }
                                }
                                if(j != h-1 && b[k][j+1] != 1)
                                for(int l = j+1;l < h;l++){
                                    if(b[k][l] == 1){
                                        byte[][] b2 = new byte[w][h];
                                        arrcpy(b, b2);
                                        b2[k][l] = 0;
                                        b2[k][l-1] = 2;
                                        b2[k][j] = 0;
                                        newset.add(b2);
                                        break;
                                    } 
                                    if(b[k][l] == 3){
                                        System.out.println(i);
                                        continue o;
                                    }
                                }
                                break p; 
                            }
                           
                        }
                    }
                }
                set = newset;
            }
            System.out.println(-1);
        }
        scan.close();
    }

    static void arrcpy(byte[][] base, byte[][] dest){
        for(int i = 0;i < h;i++){
            for(int j = 0;j < w;j++){
                dest[j][i] = base[j][i];
            }
        }
    }

}
