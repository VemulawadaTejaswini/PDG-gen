import java.util.Scanner;
 class  Main {
    static public  void  main (String[] av){
     int  b;
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int a[]= new int[n];
        int j=0;int v;
        for(int  i=0;i<n;i++){
            a[i] =sc.nextInt();
        }
                for(int k=0;k<n-1;k++){
        System.out.print(a[k]+ " ");
}
System.out.println(a[n-1]);
        for (int i= 1 ;i<=n-1;i++){
v=a[i];
        j=i-1;
        while (j>= 0 && a[j]>v){
a[j+1]=a[j];
j--;
a[j+1] =v;
        }
        for(int k=0;k<n-1;k++){
        System.out.print(a[k]+ " ");
}
System.out.println(a[n-1]);
}
        }

}
    
