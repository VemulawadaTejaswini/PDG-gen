import java.util.*;

class Main{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[3];
    for(i=0;i<3;i++)
    a[i] = sc.nextInt();

    Arrays.sort(a);

   if(a[2]%2==0)
   System.out.print("0");
   else
   System.out.print(a[0]*a[1]);
}
}




 }
}