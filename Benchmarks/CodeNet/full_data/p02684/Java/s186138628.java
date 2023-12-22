public class EL {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String[] a=in.nextLine().split(" ");
        int number=Integer.parseInt(a[0]);
        long kingLike=Long.parseLong(a[1]);
        String[] b=in.nextLine().split(" ");
        int[] Ai=new int[number];
        for (int i=0;i<number;i++){
            Ai[i]=Integer.parseInt(b[i]);
        }
        int Index=0,go=1,location=1;
        for (int j=0;j<(kingLike-1);j++){
            Index=location;
            go=Ai[Index-1];
            location=Ai[go-1];
        }
        System.out.println(location);
    }
}
