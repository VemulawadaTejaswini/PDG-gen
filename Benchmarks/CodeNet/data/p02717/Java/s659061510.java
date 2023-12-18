    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int target=scanner.nextInt();
        int n=0;
        long a=0;
        while (n<target){
            a+=1;
            if (a<10){
                n+=1;
                continue;
            }
            if (solve(a)){
                n+=1;
            }
        }
        System.out.println(a);


    }
    public static boolean solve(long a){
        char[] nums=String.valueOf(a).toCharArray();
        for (int i=0;i<nums.length-1;i++){
            if (Math.abs(Integer.parseInt(String.valueOf(nums[i]))-Integer.parseInt(String.valueOf(nums[i+1])))>1){
                return false;
            }
        }

        return true;
    }