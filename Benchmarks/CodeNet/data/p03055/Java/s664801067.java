import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int[] a1;
    static int a2[];
    static  ArrayList<Integer>[] connect;
    static int N;
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();

        connect=new ArrayList[N];
        for(int i=0;i<N;i++){
            connect[i]=new ArrayList<>();
        }
        for(int i=0;i<N-1;i++){
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            connect[a].add(b);
            connect[b].add(a);
        }
        int length=maxDepth2(maxDepth(0));
        if(length%3==1){
            System.out.println("Second");

        }else{

            System.out.println("First");
        }

    }
    static int maxDepth(int pos){
        Stack<Integer>stack=new Stack<>();
        int[] f=new int[N];
        int[] color=new int[N];
        int result1=pos;
        int result2=0;
        int dep=0;
        color[pos]=1;
        stack.push(pos);
        int now=pos;
        while(true){
            if(f[now]>=connect[now].size()){
                if(stack.empty()){
                    break;
                }
                now=stack.pop();
                dep--;
                continue;
            }
            int next=connect[now].get(f[now]);
            f[now]++;
            if(color[next]==0){
                color[next]=1;
                dep++;
                if(result2<dep){
                    result2=dep;
                    result1=next;
                }
                stack.push(now);
                now=next;
                continue;
            }
            if(dep==0){
                break;
            }
        }
        return result1;
    }
    static int maxDepth2(int pos){
        Stack<Integer>stack=new Stack<>();
        int[] f=new int[N];
        int[] color=new int[N];
        int result1=pos;
        int result2=0;
        int dep=0;
        color[pos]=1;
        stack.push(pos);
        int now=pos;
        while(true){
            if(f[now]>=connect[now].size()){
                if(stack.empty()){
                    break;
                }
                now=stack.pop();
                dep--;
                continue;
            }
            int next=connect[now].get(f[now]);
            f[now]++;
            if(color[next]==0){
                color[next]=1;
                dep++;
                if(result2<dep){
                    result2=dep;
                    result1=next;
                }
                stack.push(now);
                now=next;
                continue;
            }
            if(dep==0){
                break;
            }
        }
        return result2;
    }
}
