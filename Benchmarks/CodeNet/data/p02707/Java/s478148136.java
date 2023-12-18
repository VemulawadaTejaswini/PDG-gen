public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, 0);
        }
        for (int j = 0; j < n; j++) {
            int s = sc.nextInt();
            map.put(j, map.get(s) + 1);
        }
        for(Integer key: map.keySet()) {
            System.out.println(key + "\r");
        }
    }