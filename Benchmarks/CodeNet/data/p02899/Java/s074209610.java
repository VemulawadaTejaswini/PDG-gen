class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> a = new HashMap<>();
        int []ans = new int [n];
        for(int i=0;i<n;i++){
            a.put(sc.nextInt()-1,i);
        }
        for(int i=0;i<n;i++){
            ans[i]=a.get(i);
            System.out.println(ans[i]+1);
        }
    }
}