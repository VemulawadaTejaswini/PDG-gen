import java.io.*;
import java.util.*;

public class Main {
    
    static int[] arr;
    static HashSet<Integer> set;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        OutputStream pr = System.out;
        PrintWriter out = new PrintWriter(pr);
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double p = a*b;
        System.out.println((long)p);
    }

    // public static int dp(int x1,int y1,int x2,int y2,int n,int m,int[][] arr,int[][] vis,int[][] ans){
    //     if(x1>=n || y1>=m){
    //         return 0;
    //     }
    // }

    public static int height(int i,int n,int[][] array,int row){
        if(i>n-1){
            return 0;
        }else{
            if(row==-1){
                return Math.max(Math.max(array[0][i]+height(i+1,n,array,0),array[1][i]+height(i+1,n,array,1)),height(i+1,n,array,-1));
            }else if(row==1){
                return Math.max(array[0][i]+height(i+1,n,array,0),height(i+1,n,array,-1));
            }else{
                return Math.max(array[1][i]+height(i+1,n,array,1),height(i+1,n,array,-1));
            }
        }
    }
    public static int rest(int i,int n,int[] array, int val){
        if(i>=n){
            return 0;
        }else{
            if(val==-1){
                if(arr[i]==-1){
                    if(array[i]==0){
                        arr[i]=1+rest(i+1,n,array,0);
                        return arr[i];
                    }else if(array[i]==1){
                        arr[i]=Math.min(1+rest(i+1,n,array,0),rest(i+1,n,array,1));
                        return arr[i];
                    }else if(array[i]==2){
                        arr[i]=Math.min(1+rest(i+1,n,array,0),rest(i+1,n,array,2));
                        return arr[i];
                    }else if(array[i]==3){
                        arr[i]=Math.min(Math.min(1+rest(i+1,n,array,0),rest(i+1,n,array,1)),rest(i+1,n,array,2));
                        return arr[i];
                    }
                }else{
                    return arr[i];
                }
            }else if(val==0){
                if(arr[i]==-1){
                    if(array[i]==0){
                        arr[i]=1+rest(i+1,n,array,0);
                        return arr[i];
                    }else if(array[i]==1){
                        arr[i]=Math.min(1+rest(i+1,n,array,0),rest(i+1,n,array,1));
                        return arr[i];
                    }else if(array[i]==2){
                        arr[i]=Math.min(1+rest(i+1,n,array,0),rest(i+1,n,array,2));
                        return arr[i];
                    }else if(array[i]==3){
                        arr[i]=Math.min(Math.min(1+rest(i+1,n,array,0),rest(i+1,n,array,1)),rest(i+1,n,array,2));
                        return arr[i];
                    }
                }else{
                    return arr[i];
                }
            }else if(val==1){
                if(array[i]==0){
                    return 1+rest(i+1,n,array,0);
                }else if(array[i]==1){
                    return (1+rest(i+1,n,array,0));
                }else if(array[i]==2){
                    return Math.min(1+rest(i+1,n,array,0),rest(i+1,n,array,2));
                }else if(array[i]==3){
                    return Math.min(1+rest(i+1,n,array,0),rest(i+1,n,array,2));
                }
            }else if(val==2){
                if(array[i]==0){
                    return 1+rest(i+1,n,array,0);
                }else if(array[i]==1){
                    return Math.min(1+rest(i+1,n,array,0),rest(i+1,n,array,1));
                }else if(array[i]==2){
                    return 1+rest(i+1,n,array,0);
                }else if(array[i]==3){
                    return Math.min(1+rest(i+1,n,array,0),rest(i+1,n,array,1));
                }
            }else{
                return 0;
            }
            return 0;
        }
    } 

}