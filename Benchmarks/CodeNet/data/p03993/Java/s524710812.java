public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i] = in.nextInt();
        }
        List<Integer> toAvoid = new ArrayList<>();
        int counter = 0;
        for(int i=1;i<=n;i++){
            if(i!=arr[i] && !toAvoid.contains(i)){
                if(arr[arr[i]] == i){
                    counter++;
                    toAvoid.add(i);
                    toAvoid.add(arr[i]);
                }
            }
        }
        System.out.println(counter);
    }