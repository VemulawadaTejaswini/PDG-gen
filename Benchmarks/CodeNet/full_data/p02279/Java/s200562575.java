import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        int count;
        int[] id;
        int[] k;
        int[][] c;

        int[] parent;
        int[] depth;

        int[] flag;

        try{
            Scanner scan = new Scanner(System.in);
            String str;

            str = scan.nextLine();
            count = Integer.parseInt(str);

            id = new int[count];
            k = new int[count];
            parent = new int[count];
            depth = new int[count];
            c = new int[count][];

            flag = new int[count];

            for(int i = 0; i < count; i++){
                flag[i] = 0;

                str = scan.next();
                id[i] = Integer.parseInt(str);

                str = scan.next();
                k[id[i]] = Integer.parseInt(str);

                c[id[i]] = new int[k[id[i]]];

                for(int j = 0; j < k[id[i]]; j++){
                    str = scan.next();
                    c[id[i]][j] = Integer.parseInt(str);
                    parent[c[id[i]][j]] = id[i];
                    flag[id[i]]++;
                    depth[c[id[i]][j]] = depth[id[i]] + 1;;
                }
                // for(int j = 0; j < c[count].length; j++){
                // }
            }

            for(int i = 0; i < count; i++){
                //System.out.println("-" + flag[i]);
                if(flag[i] != 0 && 0 < k[i] && depth[i] == 0){
                    parent[i] = -1;
                }
            }

            if(count == 1){
                parent[0] = -1;
            }

            for(int i = 0; i < count; i++){
                System.out.print("node "+ i + ": parent = "
                                   + parent[i] + ", depth = "
                                   + depth[i]);

                if(parent[i] == -1){
                    System.out.print(", root, [");
                    for(int j = 0; j < k[i]; j++){
                        if(j == k[i] - 1){
                            System.out.print(c[i][j]);
                        }else{
                            System.out.print(c[i][j] + ", ");
                        }
                    }
                    System.out.println("]");
                }else if(k[i] > 0){
                    System.out.print(", internal node, [");
                    for(int j = 0; j < k[i]; j++){
                        if(j == k[i] - 1){
                            System.out.print(c[i][j]);
                        }else{
                            System.out.print(c[i][j] + ", ");
                        }
                    }
                    System.out.println("]");
                }else{
                    System.out.println(", leaf, []");
                }
                            //if(){

                //}else{

                //}
            }

        }catch(Exception e){
            System.out.println("ERROR " + e);
        }
    }
}

