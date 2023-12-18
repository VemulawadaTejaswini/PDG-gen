        Scanner scanner = new Scanner(System.in);

        // String input = scanner.nextLine();
        // System.out.println(input);

        String s = scanner.nextLine();
        String t = scanner.nextLine();

        scanner.close();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(s.length()-1);
            s = c + s.substring(0, s.length()-1);

            // System.out.println(c);
            // System.out.println(s);

            if (s.equals(t)) {
                System.out.println("Yes");
                System.exit(0);
            }
        }

        System.out.println("NO");