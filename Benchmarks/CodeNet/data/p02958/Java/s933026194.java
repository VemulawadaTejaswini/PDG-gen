import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ar = new int[num];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        int flag=0;
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]>ar[i+1])
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("YES");
        else
        {
        int front=-1,back=-1;
        if(ar[0]>ar[1])
            front=0;
        if(ar[ar.length-1]<ar[ar.length-2])
            back=ar.length-1;
        for(int i=1;i<ar.length-1;i++)
        {
            if(ar[i]>ar[i-1] && ar[i]>ar[i+1])
            {
                if(front==-1)
                    front = i;
                //System.out.println(ar[i]);
            }
            if(ar[i]<ar[i-1] && ar[i]<ar[i+1])
            {
                if(back==-1)
                    back = i;
            }
        }
        int temp = ar[front];
        ar[front]=ar[back];
        ar[back]=temp;
        // for(int i=0;i<ar.length;i++)
        //     System.out.print(ar[i]+" ");
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]>ar[i+1])
            {
                flag=2;
                System.out.println("NO");
                break;
            }
        }
        if(flag==1)
        System.out.println("YES");
    }
    }
}