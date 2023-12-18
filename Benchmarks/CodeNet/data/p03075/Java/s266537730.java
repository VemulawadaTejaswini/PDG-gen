public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<5; i++) {
            int input = sc.nextInt();
            list.add(input);
        }

        Collections.sort(list);

        int diff = list.get(4) - list.get(0);
        int k = sc.nextInt();

        if (diff <= k) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }