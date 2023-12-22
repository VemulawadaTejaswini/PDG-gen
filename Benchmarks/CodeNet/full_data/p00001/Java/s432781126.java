int[] array = { 256, 3456, 4377, 6472, 4356, 467, 3456, 346, 2345, 589 };
		for (int i = 0; i < array.length; i += 1) {
			for (int j = i + 1; j < array.length; j += 1) {
				if (array[i] < array[j]) {
					int temporary = array[i];
					array[i] = array[j];
					array[j] = temporary;
				}
			}
		}
		for (int x = 0; x < 3; x += 1) {
			System.out.println(array[x]);
		}